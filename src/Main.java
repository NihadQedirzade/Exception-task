import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Map<String,String> adlar = new HashMap<>();
//        adlar.put("Hesen","oglan");
//        adlar.put("Zehra","qiz");
//        adlar.put("Vusal","oglan");
//        adlar.put("sabir","oglan");
//        adlar.put("nezrin","qiz");
//        Map<String, List<String>> ayri = adlar.entrySet().stream()
//                .collect(Collectors.groupingBy(
//                        Map.Entry::getValue,
//                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
//
//        System.out.println(ayri);

     Scanner scanner = new Scanner(System.in);
int yas = scanner.nextInt();
String epoct = scanner.next();
        try {
            if (yas < 18 || yas > 65) {
                throw new AgeExceptionClass("yAS DOGRU DEYL");
            }
        }catch (AgeExceptionClass exceptionClass){
            System.out.println(exceptionClass.getMessage());


try {
    if(!(epoct.equals("@"))) {
        throw new EpoctExceptionClass("duz deyil");
    }
} catch (EpoctExceptionClass epoctExceptionClass){
    System.out.println(epoctExceptionClass.getMessage());

    }
}
        }
}
