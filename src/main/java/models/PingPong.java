package models;

import java.util.ArrayList;

public class PingPong {

    public ArrayList<Object> runPingPong(int countUpTo){
        ArrayList<Object> result = new ArrayList<>();
        for (int startingNumber = 1; startingNumber <= countUpTo; startingNumber++) {
          if (startingNumber % 3 == 0 && startingNumber % 5 == 0){
              result.add("PingPong");
          }else if (startingNumber % 3 == 0) {
              result.add("Ping");
          }else if (startingNumber % 5 == 0) {
              result.add("Pong");
          }else {
                result.add(startingNumber);
          }
        }
        return result;
//        return null;
    }
}