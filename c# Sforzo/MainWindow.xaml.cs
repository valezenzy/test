using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.ConstrainedExecution;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Sforzo
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        private static List <int> numberList = new List<int>();
       

        public MainWindow()
        {
            InitializeComponent();
        }

        private void insertButton_Click(object sender, RoutedEventArgs e)
        {
            string textbox1Content = TexBox1.Text;
            if (int.TryParse(textbox1Content, out int number))
            {
             

                textBoxArea1.AppendText(textbox1Content);
                textBoxArea1.AppendText(Environment.NewLine);
                numberList.Add(number);
            }
        }

       

        private void keepButton_Click(object sender, RoutedEventArgs e)
        {

            textBoxArea2.Text = "";

            var predicate = new Predicate<int>(isEven);
            var even = numberList.FindAll(predicate);

            foreach( var n in even)
            {
                textBoxArea2.AppendText(n+"");
                textBoxArea2.AppendText(Environment.NewLine);
            }

        }

        private void discard_Button_Click(object sender, RoutedEventArgs e)
        {

            textBoxArea2.Text = "";

            var predicate = new Predicate<int>(isOdd);
            var odd = numberList.FindAll(predicate);

            foreach (var n in odd)
            {
                textBoxArea2.AppendText(n + "");
                textBoxArea2.AppendText(Environment.NewLine);
            }
        }

        private bool isEven(int num)
        {

            return num % 2 == 0;
        }

        private bool isOdd(int num)
        {
            return num % 2 == 1;
        }


    }
}
