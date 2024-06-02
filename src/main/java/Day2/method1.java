package Day2;

public class method1 {

        public static double pctCalc (double fullMark , double mark) {
            return (  fullMark / mark ) * 100;
        }


        public  static String getStatus(double pct) {
            if (pct > 85) return "Exellent";
            else if (pct > 75) return "V.Good";
            else if (pct > 65) return "Good";
            else  if (pct >= 50) return "Pass";
            else return "Fail";
        }
    }





//        public static double calcPCT(double marks,double fullmarks) {
//            return marks /fullmarks *100);
//        }
//
//        public static  String getStatus (double pct) {
//            if (pct > 85) return "exllaant ";
//            else if (pct > 75) return "v.good";
//            else if (pct > 65) return "good ";
//            else if (pct >= 50) return "pass ";
//            else return "fail";
//        }
//    }



