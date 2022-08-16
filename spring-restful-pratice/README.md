## Meal

>* [Get]-尋找所有餐點
>  * http://localhost:8080/meal
>* [Get]-根據Id尋找餐點
>  * http://localhost:8080/meal/:id
>  
>  `如果Id被刪除會找不到`
>* [Post]-創建餐點
>  * http://localhost:8080/meal  
> `未做重名處理`
>* [Put]-修改餐點
>  * http://localhost:8080/meal/:id
>
>   `如果Id刪除會找不到`
>* [Delete]
>  * http://localhost:8080/meal/:id
>  
>  `未做NotFound`
## Order
>`需要先CreatOrder`
>* [Get]-尋找所有Order
>  * http://localhost:8080/order 
>* [Get]-根據Id找Order
>  * http://localhost:8080/order/:id
>* [Post]-創建一個Order
>  * http://localhost:8080/order 
>* [Put]-修改Order
>  * http://localhost:8080/order/:id~~~~ 
>* [Delete]-刪除Order
>  *http://localhost:8080/order/:id 
>