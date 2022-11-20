#include <stdio.h>

typedef char * string;

typedef struct
{
    string title;
    string author;
    int pages;
} Book;



int main()
{
    Book book1;
    book1.title="Dune";
    book1.author="Frank Herbert";
    book1.pages= 412;

    printf("Szerzo: %s\n", book1.author);


    return 0;
}
