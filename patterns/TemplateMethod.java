abstract class ComputerBuilder {

    // ...

    public final Computer buildComputer() {
        addMotherboard();
        setupMotherboard();
        addProcessor();
        return new Computer(computerParts);
    }

    public abstract void addMotherboard();
    public abstract void setupMotherboard();
    public abstract void addProcessor();

    // ...
}

class StandardComputerBuilder extends ComputerBuilder {

    @Override
    public void addMotherboard() {
        computerParts.put("Motherboard", "Standard Motherboard");
    }

    @Override
    public void setupMotherboard() {
        motherboardSetupStatus.add(
                "Screwing the standard motherboard to the case.");
        motherboardSetupStatus.add(
                "Pluging in the power supply connectors.");
        motherboardSetupStatus.forEach(
                step -> System.out.println(step));
    }

    @Override
    public void addProcessor() {
        computerParts.put("Processor", "Standard Processor");
    }
}

class HighEndComputerBuilder extends ComputerBuilder {

    @Override
    public void addMotherboard() {
        computerParts.put("Motherboard", "High-end Motherboard");
    }

    @Override
    public void setupMotherboard() {
        motherboardSetupStatus.add(
                "Screwing the high-end motherboard to the case.");
        motherboardSetupStatus.add(
                "Pluging in the power supply connectors.");
        motherboardSetupStatus.forEach(
                step -> System.out.println(step));
    }

    @Override
    public void addProcessor() {
        computerParts.put("Processor", "High-end Processor");
    }
}