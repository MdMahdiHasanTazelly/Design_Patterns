
public class ComputerFacade {
    CPU cpu;
    HardDrive hardDrive;
    Memory memory;

    public ComputerFacade(){
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.memory = new Memory();
    }

    public void start(){
        cpu.freeze();
        String data = hardDrive.read(200, 4000);
        memory.load(0, data);

        cpu.execute();
    }
}
