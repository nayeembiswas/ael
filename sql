select * from customers order by "name" desc 

INSERT INTO public.purchase_history
(id, product_name, unit_price, quantity, total_price, customer_id)
VALUES('9011257d-df56-4097-8306-af767ed50d63', 'Rice2', 25, 4, 100, '9011257d-df56-4097-8306-af767ed50d60');

SELECT customers.name, customers.phone , purchase_history.*
FROM public.customers customers, public.purchase_history purchase_history
WHERE 
	purchase_history.customer_id = customers.id
	and customers.id = 'fe6032b8-48e6-4665-9036-955957e1c121'
	
	
select * from purchase_history ph left join customers c on ph.customer_id = c.id where c.id = 'fe6032b8-48e6-4665-9036-955957e1c121'
