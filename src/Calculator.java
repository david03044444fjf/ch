import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Calcl calc = new Calcl();
        int result;
        Riman riman = new Riman();
        String[] arifm = new String[]{ "+","-", "/","*"};
        String[] arifmregex = {"\\+", "-", "/", "\\*"};
        System.out.println(arifm[1]);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Приветствую, введите выражение из чисел : ");
        String data = scanner.nextLine();
        int arifmIndex = -1;
        String reggex = "=";
        for (int i = 0; i < arifm.length; i++) {
            if (data.contains(arifm[i])){
                arifmIndex = i;
                reggex = arifm[i];
                System.out.println(arifm[i] + "index Calc " + i);
                break;
            }
        }
        if (arifmIndex == -1) {
            System.out.println("арифметический знак не найден !");
            return;
        }
        System.out.println("Next");
        String[] components = data.split(arifmregex[arifmIndex]);
        for (String str : components) {
        }
        int component1, component2;
        if (riman.isRoman(components[0]) == riman.isRoman(components[1])) {

            boolean isRoman = riman.isRoman(components[0]);
            if (isRoman) {

                component1 = riman.romanToInt(components[0]);
                component2 = riman.romanToInt(components[1]);
            }
            else {
                component1 = Integer.parseInt(components[0]);
                component2 = Integer.parseInt(components[1]);
            }
            switch (reggex) {
                case "+":
                    result = calc.Sum(component1, component2);
                    if(isRoman){
                        System.out.println(riman.intToRoman(result));
                    }
                    else{
                        System.out.println(result);
                    }
                    break;
                case "-":
                    result = calc.Dert(component1, component2);
                    if(isRoman){
                        System.out.println(riman.intToRoman(result));
                    }
                    else{
                        System.out.println(result);
                    }
                    break;
                case "*":
                    result = calc.Milt(component1, component2);
                    if(isRoman){
                        System.out.println(riman.intToRoman(result));
                    }
                    else{
                        System.out.println(result);
                    }
                    break;
                case "/":
                    result = calc.Del(component1, component2);
                    if(isRoman){
                        System.out.println(riman.intToRoman(result));
                    }
                    else{
                        System.out.println(result);
                    }
                    break;
                default:
                    System.out.println("такой операции нет");
                    break;
            }
        }
        else {
            System.out.println("Два разных формата не читаются");
        }
    }
}
