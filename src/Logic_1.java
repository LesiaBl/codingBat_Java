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




}
