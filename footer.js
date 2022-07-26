const createFooter = () => {
    let footer = document.querySelector('footer');

    footer.innerHTML = `
    <div class="footer-content">
            <img src="yalla.png" class="logo" alt="">
            <div class="footer-ul-container">
                <ul class="category">
                    <li class="category-title">men</li>
                    <li><a href="#" class="footer-link">Dishdashas</a></li>
                    <li><a href="#" class="footer-link">Thoubs</a></li>
                    <li><a href="#" class="footer-link">Perfumes</a></li>
                    <li><a href="#" class="footer-link">Shoes</a></li>
                    <li><a href="#" class="footer-link">Accessories</a></li>
                    <li><a href="#" class="footer-link">Outfits</a></li>
                    <li><a href="#" class="footer-link">Jackets</a></li>
                    <li><a href="#" class="footer-link">Vests</a></li>

                </ul>
                <ul class="category">
                    <li class="category-title">Women</li>
                    <li><a href="#" class="footer-link">Abayas</a></li>
                    <li><a href="#" class="footer-link">Hijabs</a></li>
                    <li><a href="#" class="footer-link">Jackets</a></li>
                    <li><a href="#" class="footer-link">Outfits</a></li>
                    <li><a href="#" class="footer-link">Accessories</a></li>
                    <li><a href="#" class="footer-link">Winter</a></li>
                    <li><a href="#" class="footer-link">Dresses</a></li>
                    <li><a href="#" class="footer-link">Perfumes</a></li>

                </ul>
            </div>
        </div>
        <p class="footer-title">about company</p>
        <p class="info">Yalla-Shop is an E-commerce company that ships high quality products that are coming in from 
            the Middle East to highly valued customers like yourselves. 
            We make sure to provide our customers with high quality products and ship them right to their doorstep. You can order
        from anywhere in the U.S. from the comfort of your couch and we will ship you your products from the Middle East. Our products 
    are exclusively and strictly from the Middle East and are being shipped from Saudia Arabia, Emirates, Kuwait, and Iraq. </p>
    <p class="info">support emails - hemzaalshamari@gmail.com</p>
    <p class="info">telephone - 425-598-5079</p>
    <div class="footer-social-container">
        <div>
            <a href="#" class="social-link">terms & services</a>
            <a href="#" class="social-link">privacy page</a>
        </div>
        <div>
            <a href="#" class="social-link">Instagram</a>
            <a href="#" class="social-link">Facebook</a>
            <a href="#" class="social-link">Twitter</a>
        </div>
    </div>
    <p class="footer-credit">Yalla-Shop, shop the best apparels with comfort!</p>
    `;
}
createFooter();