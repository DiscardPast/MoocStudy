#include <iostream>
#include <stdlib.h>
#include "myqueue.h"

/**********************************/
/*Ring Queue*/
/**********************************/

int main(void)
{
    MyQueue *p = new MyQueue(4);
    delete p;
    p = NULL;


    return 0;
}
