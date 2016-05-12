

def g(x):
    return -2*x**2+5*x+2

ep=0.0001
x=0.1
#while g(x+ep)>g(x):
#    x+=ep*(-4*x+5)
#    print g(x)

#print x,g(x)

def f(x1,x2,x3,x4,x5):
    return (x1-x3)**2+(x1+x2)**2+(x2-1)**2+(2*x4+x1-x2)**2+(x5+x1-x3)**2

isOver=False
x1,x2,x3,x4,x5=0,0,0,0,0
while isOver==False:
    fOld=f(x1,x2,x3,x4,x5)
    x1-=2*ep*((x1-x3)+2*(x1+x2))
    x2-=2*ep*((x1+x2)+2*(x2-1)-2*(2*x4+x1-x2))
    x3-=ep*(-2*(x1-x3)-2*(x5+x1-x3))
    x4-=ep*4*(2*x4+x1-x2)
    x5-=ep*2*(x5+x1-x3)
    fNew=f(x1,x2,x3,x4,x5)
    if fNew>fOld:
        isOver=True
    print f(x1,x2,x3,x4,x5)

print x1,x2,x3,x4,x5,f(x1,x2,x3,x4,x5)