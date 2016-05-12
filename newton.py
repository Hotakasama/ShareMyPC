import math
from sympy import *

def f(x,b):#x->variable,b->coefficient matrix
    sum=b[0]
    for i in range(len(b)-1):
        sum=sum*x+b[i+1]
    return sum
    
b=[-1,0,2,0,-1.0]
var('x')#as a variable
x_0=x_k=2.0
ep=10**-10
f=f(x,b)
df=diff(f)
while(abs(f.subs([(x,x_k)]))>ep):
    x_k=x_k-f.subs([(x,x_k)])/df.subs([(x,x_k)])
print x_k