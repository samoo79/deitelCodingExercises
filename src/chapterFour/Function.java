package chapterFour;

public class Function {

    public int multiply(int copy, int price) {

        if (copy > 0 && copy <= 4) {
            price = 2000 * copy;
        }
        if (copy > 4 && copy <= 9 ){
            price = 1800 * copy;
        }
        if (copy > 9 && copy <= 29){
            price = 1600 * copy;
        }
        if (copy > 29 && copy <= 49){
            price = 1500 * copy;
        }
        if (copy > 49 && copy <= 99){
            price = 1300 * copy;
        }
        if (copy > 99 && copy <= 199){
            price = 1200 * copy;
        }
        if (copy > 199 && copy <= 499){
            price = 1100 * copy;
        }
        if (copy > 499){
            price = 1000 * copy;
        }
        return price ;
    }
}