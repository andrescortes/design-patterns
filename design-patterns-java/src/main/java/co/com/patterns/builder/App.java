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

            Computer highComputer = new Computer.ComputerBuilder()
                    .cpu("Ryzen 7 9800X3D")
                    .ram("64GB")
                    .storage("2TB nvme")
                    .gpu("4090 24Gb")
                    .build();
        highComputer.displayConfiguration();

        String query = new Query.QueryBuilder("users")
                .select("id", "name", "email")
                .where("age > 18")
                .where("country = 'cri'")
                .orderBy("name", "ASC")
                .limit(10)
                .execute();
        System.out.println("query = " + query);
    }
}
