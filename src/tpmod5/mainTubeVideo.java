/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmod5;

/**
 *
 * @author fachrur fatanillah
 */
public class mainTubeVideo {
    public static void main(String[] args)
    {
        SayaTubeVideo a = new SayaTubeVideo("Tutorial Design By Contract â€“ fachrur fatanillah");
        a.PrintVideoDetails();
        for (int i = 0; i < 1; i++)
        {
            a.IncreasePlayCount(0);
        }
        a.PrintVideoDetails();
    }
}
