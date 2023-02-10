const AWS = require("aws-sdk");
const openSearch = new AWS.OpenSearch();

exports.handler = async (event) => {
  const data = JSON.parse(event.body);

  const params = {
    DomainName: "api-test.com",
    Content: data,
  };

  try {
    await openSearch.uploadDocuments(params).promise();
    return {
      statusCode: 200,
      body: JSON.stringify({ message: "Data successfully uploaded to OpenSearch" }),
    };
  } catch (error) {
    return {
      statusCode: 500,
      body: JSON.stringify({ error: error.message }),
    };
  }
};
