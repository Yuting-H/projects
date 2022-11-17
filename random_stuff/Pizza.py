# A class about pizza
class Pizza:
    def __init__(self, size, toppingsList):
            self.size = size
            self.toppingList = toppingsList
            
    def __repr__(self) -> str:
          return("The size is", self.toppingList)
    
    
    
    
p1 = Pizza("L","222")

print(p1.size)
print(p1)