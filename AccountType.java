import javax.swing.JOptionPane;
public class AccountType { 
   public enum MonthType {January, February, March, April, May, June, July, August, September, October, November, December}
 public static void main(String[] args) { 
             MonthType[] choices = { MonthType.January, MonthType.February, MonthType.March, MonthType.April, MonthType.May, MonthType.June, MonthType.July, MonthType.August, MonthType.September, MonthType.October, MonthType.November, MonthType.December, }; 
             MonthType input = (MonthType) JOptionPane.showInputDialog(null,"Select a month.", "Month Selector", 
                                                                           JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]); 
             while (input!=null) { 
                      //Fill in switch case code below to check for account type and return appropriate Welcome message
       
            if(input.equals(MonthType.January) || input.equals(MonthType.February) || input.equals (MonthType.December)) 
            	 JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
            
            if(input.equals(MonthType.March) || input.equals(MonthType.April) || input.equals (MonthType.May)) 
           	 JOptionPane.showMessageDialog(null, "Happy Spring days!");
            
            if(input.equals(MonthType.June) || input.equals(MonthType.July) || input.equals (MonthType.August)) 
           	 JOptionPane.showMessageDialog(null, "It's summer time");
            
            if(input.equals(MonthType.September) || input.equals(MonthType.October) || input.equals (MonthType.November)) 
           	 JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
  
         
            
                      input = (MonthType) JOptionPane.showInputDialog(null,"Select a month.", "Month Selector", 
                                                                        JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
      } 
   }
}
