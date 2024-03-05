public class Main {
    public static void main(String[] args)
    {
        //Questão 2
        Fibbonaci(13);

        //Questão 5
        ReverseString("teste");
    }

    //Questão 2
    public static void Fibbonaci(int number){

        int lastNumber = 0;
        int currentNumber = 1;

        while (currentNumber < number){
            int hold = lastNumber;
            lastNumber = currentNumber;
            currentNumber += hold;
        }

        if(currentNumber == number){
            System.out.println("O número informado pertence a sequência de Fibonacci");
        }else{
            System.out.println("O número informado não pertence a sequência de Fibonacci");
        }

    }

    //Questão 5
    public static void ReverseString(String string){

        String str = string;
        String[] baseArray = str.split("");
        String[] reversedArray = str.split("");

        for (int i = 0; i < baseArray.length; i++){
            reversedArray[baseArray.length - i - 1] = baseArray[i];
        }

        String reversedStr = String.join("", reversedArray);

        System.out.println(reversedStr);
    }
}
