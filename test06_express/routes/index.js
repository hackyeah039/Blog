var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express',hello :'anananan' });
});

router.get('/join',function(req,res,next){
	res.render('join');
});
module.exports = router;
