public class PersonNum {
    public static void main(String[] args) {
        String personNum = "8711111234567";
        String prefixNum = personNum.substring(0,6);
        String divisionNum = String.valueOf(personNum.charAt(6));
        String birthDay = "";
        if(divisionNum.equals("1") || divisionNum.equals("2") ){
            birthDay = "19"+prefixNum;
        }else{
            birthDay = "20"+prefixNum;
        }
//        switch (divisionNum){
//            case "1":
//            case "2":
//                birthDay = "19"+prefixNum;
//                break;
//            case "3":
//            case "4":
//                birthDay = "20"+prefixNum;
//                break;
//        }
        System.out.println(birthDay);
    }
}
