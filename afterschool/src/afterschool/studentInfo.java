package afterschool;
import java.util.Scanner;
import afterschool.MemberDAO;

public class studentInfo{

   public static void main(String[] args) {
      Scanner key = new Scanner(System.in);
      MemberDAO dao = new MemberDAO();
      String id, name, department, phone;
      int result=0;
      System.out.println("*********** 학생 정보 시스템 ********");
      System.out.println("1. 학생등록");
      System.out.println("2. 학생수정");
      System.out.println("3. 학생삭제");
      System.out.println("4. 학생조회");
      System.out.println("5. 종료");
      System.out.println("원하는 작업을 입력하세요. :");
      int choice = key.nextInt();
      switch(choice){
         case 1:
            System.out.println("*********** 학생등록 ************* ");
            System.out.println("ID(숫자,공백없이): ");
            id = key.next();
            System.out.println("Name(영문,공백없이): ");
            name = key.next();
            System.out.println("Department(영문,공백없이): ");
            department = key.next();
            System.out.println("Phone(숫자,공백없이): ");
            phone = key.next();
            result = dao.add(id, name, department, phone);
            if(result==1)
           	 System.out.println("학생추가가 완료되었습니다.");
            else
           	 System.out.println("학생추가가 실패하였습니다.");
            break;
         case 2:
            System.out.println("*********** 학생수정 ************* ");
            System.out.println("수정하고 싶은 학생의 ID: ");
            id = key.next();
            System.out.println("수정할 휴대폰번호를 입력하세요: ");
            phone = key.next();
            result =dao.update(id,phone);
            if(result==1)
           	 System.out.println("학생수정이 완료되었습니다.");
            else
           	 System.out.println("학생수정이 실패하였습니다.");
            break;
         case 3:
             System.out.println("*********** 학생삭제 ************* ");
             System.out.println("삭제하고 싶은 학생의 ID: ");
             id = key.next();
             result = dao.delete(id);
             if(result==1)
            	 System.out.println("학생삭제가 완료되었습니다.");
             else
            	 System.out.println("학생삭제가 실패하였습니다."); 
             break;
          case 4:
             System.out.println("*********** 학생조회 ************* ");
             System.out.println("조회하고 싶은 학생의 ID: ");
             id = key.next();
             dao.view(id);
             break;
         
            
      }
      
   }

   


}