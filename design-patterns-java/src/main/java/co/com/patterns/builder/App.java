package co.com.patterns.builder;

public class App {
    public static void main(String[] args) {
            Computer computer = new Computer.ComputerBuilder()
                    .cpu("Ryzen 7 7800X3D")
                    .ram("32GB")
                    .storage("1TB nvme")
                    .gpu("4070ti Super")
                    .build();
            computer.displayConfiguration();
    }
}
