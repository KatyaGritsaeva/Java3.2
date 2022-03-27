public class BmiService {
        public double calculate(double weight, double height) {

            //Входные данные

            // Логика программы
            double bmi = weight / (height * height);
            return bmi;
        }

}

