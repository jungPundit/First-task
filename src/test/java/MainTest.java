/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.so.firsttask.Main;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Влад
 */
public class MainTest {

    public MainTest() {
    }

    @Test
    public void test() {
        Main m = new Main();
        System.out.println(m.calculate(4));
    }
}
