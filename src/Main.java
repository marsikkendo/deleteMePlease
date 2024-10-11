public class Main {


    //status file in git
    // not tracked - красный
    // added(созданный) - зеленый
    // removed
    // changed - синим
    // not changed - белый

    public static void main(String[] args) {

        String colorDog  = "red";
        int color2 = getSum(10, 15);
        int qwe2 = getSum(16, 15);
        System.out.println(color2);
        System.out.println(qwe2);

     }
    //   public static возвращаемый тип имя метода (параметры) {}
    public static int getSum(int x, int y){
        int result;
        result = x + y;
        return result;
    }

    public static void printSum(int x, int y){
        int result;
        result = x + y;
        System.out.println(result);
        // sendMessageToEmailBox
        // saveDataToDB
        // sout
    }



// Примитивами
// целые чиселки - byte, short, int ,long
// дробные - float, double
// логический - boolean
// символ - char 'a'


// Ссылочный тип данных
    // строки - String - "qwe" - ['q','w','e']



}
