import { COLORS } from "../helpers/colors.ts";

class Computer {
  public cpu: string = "cpu - not defined";
  public ram: string = "ram - not defined";
  public storage: string = "storage - not defined";
  public gpu?: string = "gpu - not defined";

  displayConf(): void {
    console.log(
      `Conf Computer: \nCPU: ${this.cpu}\nRAM: ${this.ram}\nStorage: ${this.storage}\nGPU: ${this.gpu}`
    );
  }
}

class ComputerBuilder {
  private computer: Computer;

  constructor() {
    this.computer = new Computer();
  }

  setCpu(cpu: string): ComputerBuilder {
    this.computer.cpu = cpu;
    return this;
  }

  setRam(ram: string): ComputerBuilder {
    this.computer.ram = ram;
    return this;
  }

  setStorage(storage: string): ComputerBuilder {
    this.computer.storage = storage;
    return this;
  }

  setGpu(gpu: string): ComputerBuilder {
    this.computer.gpu = gpu;
    return this;
  }

  build(): Computer {
    return this.computer;
  }
}

function main() {
  const basicComputer = new ComputerBuilder()
    .setCpu("Intel 13900KF")
    .setRam("16Gb DDR6")
    .setStorage("256Gb")
    .setGpu("RTX 3050 8GB")
    .build();

  console.log("%cBasic Computer", COLORS.blue);
  basicComputer.displayConf();

  const premiunComputer = new ComputerBuilder()
    .setCpu("Ryzen 5500")
    .setRam("8Gb DDR4")
    .setStorage("SSD 480Gb")
    .setGpu("Raden 6600x 8Gb")
    .build();

  console.log("\n%cPremiun PC :>> ", COLORS.blue);
  premiunComputer.displayConf();
}

main();
