package hello.servlet.basic;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 롬복 라이브러리를 통해서 getter setter 생성완료
public class HelloData {

    private String username;
    private int age;

}
