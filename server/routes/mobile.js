/* routes/mobile.js */

// 라우팅을 위한 기본 모듈 포함
const express = require('express'),
  router = express.Router(),
  db = require('../database/db.js');

// 로그인 요청 및 응답
router.post('/login', (req, res) => {
  
});

// 회원가입 요청 및 응답
router.post('/signup', (req, res) => {
    console.log(req.body);
    const user = {
            userName : req.body.userName,
            userId : req.body.userId,
            userPasswd : req.body.userPasswd
        };

    db.query(`INSERT INTO users(name, id, passwd) values('${user.userName}', '${user.userId}', '${user.userPasswd}')`), (err, result) => {
        // if (err) {
        //     console.log(err);
        //     res.json( { success : false } );
        // }
        console.log(result);
        res.json( {success : true} );
    }
    // res.json( {success : true} )
});

router.get('/', (req, res) => {
    console.log(req.body);
    console.log(req.params);
    res.send("good");
});

// 모듈 내보내기
module.exports = router;
