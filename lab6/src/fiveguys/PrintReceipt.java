//package fiveguys;
//
//public class PrintReceipt{
//
//    public PrintReceipt(){
//
//        public String contents(){
//            String out = "";
//            out += "\n";
//            int total_space = 44;
//            String headerFirstLine = "FIVE GUYS";
//            out += padSpaces((total_space - headerFirstLine.length())/2) + headerFirstLine + "\n";
//            String headerSecondLine = "BURGERS AND FRIES";
//            out += padSpaces((total_space - headerSecondLine.length())/2) + headerSecondLine + "\n";
//            String headerThirdLine = "STORE # CA-1294";
//            out += padSpaces((total_space - headerThirdLine.length())/2) + headerThirdLine + "\n";
//            String headerFourthLine = "5353 ALMADEN EXPY N60";
//            out += padSpaces((total_space - headerFourthLine.length())/2) + headerFourthLine + "\n";
//            String headerFifthLine = "SAN JOSE, CA 95118";
//            out += padSpaces((total_space - headerFifthLine.length())/2) + headerFifthLine + "\n";
//            String headerSixthLine = "(P) 408-264-9300";
//            out += padSpaces((total_space - headerSixthLine.length())/2) + headerSixthLine + "\n";
//            out += "\n\n\n";
//            String time = "12/1/2016   1:46:54 PM";
//            out += padSpaces((total_space - time.length())/2) + time + "\n";
//            out += padSpaces((total_space - headerFirstLine.length())/2) + headerFirstLine + "\n";
//            return out;
//        }
//
//    }
//
//    private String padSpaces(int num) {
//        String spaces = "";
//        for (int i = 0; i < num; i++)
//            spaces += " ";
//        return spaces;
//    }
//
//
//
//
//}
