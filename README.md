# Name Sorter

This project sorts a list of names by last name and then by given names.

## Requirements

- Java 11 or higher
- Maven

## How to Build

1. Clone the repository
    ```sh
    git clone https://github.com/yourusername/name-sorter.git
    cd name-sorter
    ```

2. Build the project
    ```sh
    mvn clean install
    ```

## How to Run

```sh
java -cp target/classes com.namesorter.NameSorter ./unsorted-names-list.txt
