
package gpfinance.datatypes;

import java.util.Random;

/**
 * @date   14-July-2013
 * @author Sudheesh Singanamalla
 */
public enum Fund implements Indicator {
    RAD(0, "Research & Development as a % of sales YoY"),
    ROI(1, "TEST: Return on Investment");
    
    private int code;
    private String label;

    private Fund(int code, String label) {
        this.code = code;
        this.label = label;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getLabel() {
        return label;
    }
    
    public static Fund getRandom(){
        Fund[] indicators = Fund.values();
        return indicators[new Random().nextInt(indicators.length)];
    }
}
