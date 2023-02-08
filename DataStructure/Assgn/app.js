
require('dotenv').config();
const mysql = require('mysql');
var router = express.Router()
var app = express();
var bodyParser = require('body-parser');
app.use(bodyParser.json())
app.set('port', process.argv[2] || process.env.PORT);
var http = require('http');
app.set('view', 'Assgn/index.ejs')
app.get('/', function (req, res) {
    var mysqlConnection = mysql.createConnection({
        connectionLimit: 100,
        host: process.env.host,
        user: process.env.user,
        password: process.env.password,
        database: process.env.database,
        port: process.env.port,
        multipleStatements: true
    });

    mysqlConnection.connect((err,) => {
        if (!err)
            console.log('DB connection succeded.');
        else
            console.log('DB connection failed \n Error : ' + JSON.stringify(err, undefined, 2));
    });

    mysqlConnection.query("select * from users limit 3", (err, rows, fields) => {
        if (!err) {
            rows.forEach((e) => {
                console.log(e.name)
                res.render('index', { data: rows })
            })
        }
        else {
            console.log(err)
        }
    });
})

http.createServer(app).listen(app.get('port'), function () {
    console.log('Express server listening on port ' + app.get('port'));
});