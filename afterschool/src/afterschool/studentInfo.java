package afterschool;
import java.util.Scanner;
import afterschool.MemberDAO;

public class studentInfo{

   public static void main(String[] args) {
      Scanner key = new Scanner(System.in);
      MemberDAO dao = new MemberDAO();
      String id, name, department, phone;
      System.out.println("*********** �л� ���� �ý��� ********");
      System.out.println("1. �л����");
      System.out.println("2. �л�����");
      System.out.println("3. �л�����");
      System.out.println("4. �л���ȸ");
      System.out.println("5. ����");
      System.out.println("���ϴ� �۾��� �Է��ϼ���. :");
      int choice = key.nextInt();
      switch(choice){
         case 1:
            System.out.println("*********** �л���� ************* ");
            System.out.println("ID(����,�������): ");
            id = key.next();
            System.out.println("Name(����,�������): ");
            name = key.next();
            System.out.println("Department(����,�������): ");
            department = key.next();
            System.out.println("Phone(����,�������): ");
            phone = key.next();
            dao.add(id, name, department, phone);
            System.out.println("�л������ �Ϸ�Ǿ����ϴ�.");
            break;
         case 2:
            System.out.println("*********** �л����� ************* ");
            System.out.println("�����ϰ� ���� �л��� ID: ");
            id = key.next();
            System.out.println("������ �޴�����ȣ�� �Է��ϼ���: ");
            phone = key.next();
            dao.update(id,phone);
            System.out.println("�л������� �Ϸ�Ǿ����ϴ�.");
            break;
         case 3:
             System.out.println("*********** �л����� ************* ");
             System.out.println("�����ϰ� ���� �л��� ID: ");
             id = key.next();
             dao.delete(id);
             System.out.println("�л������� �Ϸ�Ǿ����ϴ�.");
             break;
          case 4:
             System.out.println("*********** �л���ȸ ************* ");
             System.out.println("��ȸ�ϰ� ���� �л��� ID: ");
             id = key.next();
             dao.view(id);
             System.out.println("�л���ȸ�� �Ϸ�Ǿ����ϴ�.");
             break;
         
            
      }
      
   }

   


}