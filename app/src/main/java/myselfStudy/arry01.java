package myselfStudy;

public class arry01 {
  public static void main(String[] args) {
    int i, j, k, nmg;

    int a[][] = new int [5][5];

    i = 0;

    j = 5 / 2;

    for (k = 1; k < 26; k++) {

      a[i][j] = k;

      nmg = k - k / 5 * 5;

      if(nmg == 0) {

        i++;

        continue;

      }

      i--;

      j++;

      if (i < 0 ) {
        i = 4;
      }
      if (j>4) {

        j = 0;
      }
      for ( int x = 0; x <=4; x++) {

        for (int y = 0; y <= 4; y++) {

          System.out.printf("%3d", a[x][y]);

        }

        System.out.println();
      }
    }
  }

}

user[] users =new user[];1

users[0]=new user("admin","1234"); //어드민 계정 생성2

users[i]=new user();3

users[i].add(); // 회원가입정보 입력4


if(users[i].admin=1) {          5 
  (관리자 메뉴)
  게시판 메서드(users[i]);
}
else {

  (입주민 메뉴)
  게시판 메서드(user[i]);
}


public void 게시판 메서드(user user) {

  if(user.admin=1) {
    관리자 메뉴
    게시글 핸들러(user);
  }else {
    입주민 메뉴
    게시글 핸들러(user);
  }
}

