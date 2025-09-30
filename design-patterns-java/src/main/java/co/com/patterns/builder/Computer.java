package co.com.patterns.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;

    public Computer() {
        this.cpu = "cpu - not defined";
        this.ram = "ram - not defined";
        this.storage = "storage - not defined";
        this.gpu = "gpu - not defined";
    }

    public void displayConfiguration() {
        String message = String.format("CPU: %s, RAM: %s, STORAGE: %s, GPU: %s", cpu, ram, storage, gpu);
        System.out.println("PC conf: \n".concat(message));
    }

    static class ComputerBuilder {
        private final Computer computer;

        public ComputerBuilder() {
            this.computer = new Computer();
        }

        public ComputerBuilder cpu(String cpu) {
            this.computer.setCpu(cpu);
            return this;
        }

        public ComputerBuilder ram(String ram) {
            this.computer.setRam(ram);
            return this;
        }

        public ComputerBuilder storage(String storage) {
            this.computer.setStorage(storage);
            return this;
        }

        public ComputerBuilder gpu(String gpu) {
            this.computer.setGpu(gpu);
            return this;
        }

        public Computer build() {
            return this.computer;
        }
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
