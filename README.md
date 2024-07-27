# EmployeeSalaryReport

The `EmployeeSalaryReport` project reads employee data from a text file and performs operations like filtering based on salary and summing salaries for employees whose names start with 'M'. It demonstrates file I/O, OOP, and Java 8 streams. Features include listing emails of employees with high salaries and calculating salary sums. Uses Java 17 and Eclipse IDE.

## Features

- Read employee data from a text file
- Filter employees based on salary
- List email addresses of employees with salaries above a certain threshold
- Calculate the sum of salaries for employees whose names start with a specified letter

## Technologies Used

- Java 17
- Eclipse IDE

## How to Run

1. **Clone the repository**:
   ```sh
   git clone https://github.com/josivantarcio/EmployeeSalaryReport.git
   ```

2. **Open the project in Eclipse**:
   - Open Eclipse IDE
   - Go to `File -> Import -> Existing Projects into Workspace`
   - Select the cloned repository directory

3. **Place the input file**:
   - Ensure the input file `in.txt` is placed in the root directory of the project
   - The file should contain employee data in the format:
     ```
     name,email,salary
     John Doe,johndoe@example.com,50000
     ```

4. **Run the program**:
   - Run the `Program` class located in the `application` package

## Input File Example

```
John Doe,johndoe@example.com,50000
Jane Smith,janesmith@example.com,60000
Michael Johnson,michaeljohnson@example.com,70000
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
