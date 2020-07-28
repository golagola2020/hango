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
  
});

// 모듈 내보내기
module.exports = router;
