public class Logic_1 {


    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend){
            if(cigars >= 40) return true;
            else return false;
        }else{
            if(cigars >= 40 & cigars <= 60) return true;
            return false;
        }
    }


    public int dateFashion(int you, int date) {
        if(you <=2 || date <=2) return 0;
        else if(you >=8 || date >=8 ) return 2;
        else return 1;
    }


    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer){
            if(temp >= 60 & temp <= 100) return true;
            return false;
        }else if(temp >= 60 & temp <= 90)return true;

        return false;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday){
            if(speed <= 65) return 0;
            else if(speed >= 66 && speed <=85) return 1;
            return 2;
        }
        if(speed <= 60) return 0;
        else if(speed >= 61 && speed <=80) return 1;
        return 2;

    }
    public int sortaSum(int a, int b) {
        if(a +b > 9 & a +b < 20 )return 20;
        else return a+b;
    }


}
