/* 
 * 네트워크 통신에 사용
 * 보안과 유지보수를 위해 별도 파일로 분류
 */

#define SECRET_SSID "Dev-iPhone"
#define SECRET_PASS "00000009"

// 3.34.207.199
#define SERVER_IP "172.20.10.2" //  서버 아이피 (고정IP이기 때문에 변경할 필요 없음)
#define PORT 80 // 포트 번호(HTTP : 80, HTTPS : 443 => 두 개의 포트를 모두 열어놨기 때문에 둘 중 하나 사용하면 됨)
#define SERVER_HOST "http://ec2-3-34-207-199.ap-northeast-2.compute.amazonaws.com/"  // 서버 도메인
