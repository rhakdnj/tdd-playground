package chap08.testable;

import chap08.subs.Grade;
import chap08.subs.Product;
import chap08.subs.Subscription;
import java.time.LocalDate;

public class PointRule {

    public int calculate(Subscription subscription, Product product, LocalDate now) {
        int point = 0;
        if (subscription.isFinished(now)) {
            point += product.getDefaultPoint();
        } else {
            point += product.getDefaultPoint() + 10;
        }
        if (subscription.getGrade() == Grade.GOLD) {
            point += 100;
        }
        return point;
    }
}
