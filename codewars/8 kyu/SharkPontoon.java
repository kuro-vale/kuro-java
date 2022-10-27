// https://www.codewars.com/kata/57e921d8b36340f1fd000059

public class SharkPontoon {
  public static String shark(double pontoonDistance,
                             double sharkDistance, double youSpeed, double sharkSpeed, boolean dolphin) {
      if (dolphin) {
          sharkSpeed /= 2;
      }
      var sharkEatTime = sharkDistance / sharkSpeed;
      var safeTime = pontoonDistance / youSpeed;

      return sharkEatTime < safeTime ? "Shark Bait!" : "Alive!";
  }
}
