'use strict';
console.log('hello world function');
 
export const handler = async (event) => {
    let name = "James";
    let responseCode = 200;
    console.log("request: " + JSON.stringify(event));
    
    if (event.body) {
        let body = JSON.parse(event.body)
        if (body.time) 
            time = body.time;
    }
 
    let greeting = `Hi ${name} `;

    let responseBody = {
        message: greeting
    };
    
    let response = {
        statusCode: responseCode,
        headers: {
            'Content-Type':'application/xml'
        },
        body: JSON.stringify(responseBody)
    };
    console.log("response: " + JSON.stringify(response))
    return response;
};