package afterschool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import afterschool.ConnUtil;

public class MemberDAO {
   public int add(String id, String name, String department, String phone) {
      int rst = 0;
      Connection conn = null;
      PreparedStatement ps = null;
      try{
         conn = ConnUtil.getConnection();
         String sql = "insert into student(id,name,department,phone) values(?,?,?,?)";
         ps = conn.prepareStatement(sql);
         ps.setString(1, id);
         ps.setString(2, name);
         ps.setString(3, department);
         ps.setString(4, phone);
         rst = ps.executeUpdate();
      }catch(Exception e){
      e.printStackTrace();
      }finally{
         ConnUtil.close(ps, conn);
      }
      return rst;
   }
   
   public int update(String id, String phone){
      int rst = 0;
      Connection conn = null;
      PreparedStatement ps = null;
      try{
         conn = ConnUtil.getConnection();
         String sql = "update student set phone = ? where id = ?";
         ps = conn.prepareStatement(sql);
         ps.setString(1, phone);
         ps.setString(2, id);
         rst = ps.executeUpdate();
      }catch(Exception e){
         e.printStackTrace();
      }finally{
         ConnUtil.close(ps, conn);
      }
      return rst;
   }
   public int delete(String id){
	      int rst = 0;
	      Connection conn = null;
	      PreparedStatement ps = null;
	      try{
	         conn = ConnUtil.getConnection();
	         String sql = "delete from student where id = ?";
	         ps = conn.prepareStatement(sql);
	         ps.setString(1, id);
	         rst = ps.executeUpdate();
	      }catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         ConnUtil.close(ps, conn);
	      }
	      return rst;
	   }
	   
	 public void view(String id){
	      ResultSet rs = null;
	      Connection conn = null;
	      PreparedStatement ps = null;
	      try{
	         conn = ConnUtil.getConnection();
	         String sql = "select * from student where id ="+"'"+id+"'";
	         ps = conn.prepareStatement(sql);
	         rs = ps.executeQuery(sql);
	         while(rs.next()){
	            System.out.println(rs.getString(1)+'\t'+rs.getString(2)+'\t'+rs.getString(3)+'\t'+rs.getString(4));

	         }
	            
	      }catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         ConnUtil.close(ps, conn);
	      }
	   }
   
}

