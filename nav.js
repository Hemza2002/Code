const createNav = () => {
    let nav = document.querySelector('.navbar');

    nav.innerHTML = `
    <div class="nav">
    <img src = "yalla.png" class="brand-logo" alt="">
    <div class="nav-items">
        <div class="search">
            <input type="text" class="search-box" placeholder="search brands, products, etc.">
            <button class="search-btn">search</button>
        </div>
        <a href="#"><img src="user icon.png" alt="" height="30px" width="30px"></a>
        <a href="#"><img src="cart.png" alt="" height="60px" width="30px"></a>
    </div>  
</div>
<ul class="links-container">
    <li class="link-item"><a href="#" class="link">Home</a>
    <li class="link-item"><a href="#" class="link">Men</a>
    <li class="link-item"><a href="#" class="link">Women</a>
    <li class="link-item"><a href="#" class="link">Kids</a>
    <li class="link-item"><a href="#" class="link">Accessories</a>
</ul>
`;

}
createNav()