package org.wso2.carbon.mss.loch.testcasetwo;
import org.wso2.carbon.mss.MicroservicesRunner;


/**
 * Created by lochana on 11/4/15.
 */
public class Application {
    public static void main(String[] args) {

        new MicroservicesRunner().deploy(new MemberServices()).start();
    }
}
