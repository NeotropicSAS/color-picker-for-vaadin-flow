# Color Picker Component for Vaadin Flow

This project provides a simple **HTML Color Picker** (`<input type="color">`) as a Vaadin Flow add-on.  
It allows you to use the native browser color input in your Vaadin applications.

## License

Apache License 2.0

## Requirements

- Java 21
- Apache Maven 3.9+

## Installation

Install the component in your local repository

```bash
    mvn clean install --DskipTests
```

Use the following maven dependency in your project

```bash
    <dependency>
        <groupId>com.neotropic.flow.component</groupId>
        <artifactId>color-picker-for-vaadin-flow</artifactId>
        <version>0.1.0</version>
        <type>jar</type>
    </dependency> 
```

## Usage

```bash
    ColorPicker colorPicker = new ColorPicker();
    add(colorPicker);
```

## Disclaimer

Use this component at your own risk.
