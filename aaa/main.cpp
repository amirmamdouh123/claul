#include <iostream>

using namespace std;

int main()
{
 int a , b ,c;
 cin >>a>>b>>c;
 if (a>b)
    swap(a,b);
    if (b%c==0)
     cout<< (b/c)-(a/c)+1;
    else
 cout << (b/c)-(a/c);
    return 0;
}
