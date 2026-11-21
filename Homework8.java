import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id,pw;
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("myId","myPass");
        hashMap.put("myId2","myPass2");
        hashMap.put("myId3","myPass3");

        while(true) {
            System.out.println("id와 password를 입력해주세요");
            System.out.print("id : ");
            id = sc.next().trim();
            if(!hashMap.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }
            System.out.print("password : ");
            pw = sc.next().trim();
            if(pw.equals(hashMap.get(id))){
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
            else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
    }
}

