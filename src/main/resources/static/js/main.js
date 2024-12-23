$(document).ready(function() {
    $('#laptopForm').submit(function(event) {
        // Validate Laptop Brand (Alpha Numeric)
        var brandName = $('#brandName').val();
        var brandRegex = /^[a-zA-Z0-9\s]+$/;
        if (!brandName.match(brandRegex)) {
            alert('Brand name should be alphanumeric.');
            event.preventDefault();
        }

        // Validate Model (Alpha Numeric)
        var model = $('#model').val();
        if (!model.match(brandRegex)) {
            alert('Model should be alphanumeric.');
            event.preventDefault();
        }

        // Validate Stock Quantity (Numeric)
        var stock = $('#stockQuantity').val();
        if (isNaN(stock) || stock <= 0) {
            alert('Stock quantity should be a positive number.');
            event.preventDefault();
        }

        // Validate Price (Numeric)
        var price = $('#price').val();
        if (isNaN(price) || price <= 0) {
            alert('Price should be a positive number.');
            event.preventDefault();
        }
    });
});
