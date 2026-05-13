# 🛍️ KEWA - Tienda de Tecnología Premium

Proyecto de tienda online con **20 funcionalidades** completas, almacenamiento en la nube con **Supabase** y sincronización en tiempo real.

## ✨ Características

✅ Login/Registro de usuarios
✅ Carrito de compras completo
✅ Wishlist (Favoritos)
✅ Historial de compras
✅ Programa de lealtad (Puntos)
✅ Filtros avanzados
✅ Buscador inteligente
✅ Comparador de productos
✅ Opiniones de clientes
✅ Preguntas y respuestas
✅ Múltiples direcciones de envío
✅ Panel de administrador
✅ Redes sociales integradas
✅ Diseño responsive
✅ Datos sincronizados en la nube

## 🚀 Instalación Rápida

### 1. Clonar el repositorio
```bash
git clone https://github.com/tuusuario/KEWA.git
cd KEWA
```

### 2. Configurar Supabase (Para sincronización en nube)

**Opción A: Si quieres datos en la nube (RECOMENDADO)**

1. Ir a [supabase.com](https://supabase.com)
2. Crear cuenta gratis
3. Crear nuevo proyecto
4. En Settings → API → copiar:
   - `SUPABASE_URL`
   - `SUPABASE_KEY`
5. Crear archivo `.env` en la raíz:
```
SUPABASE_URL=tu_url_aqui
SUPABASE_KEY=tu_key_aqui
```

6. El proyecto automáticamente sincronizará datos con Supabase

**Opción B: Sin Supabase (datos solo locales)**

Simplemente abre `index.html` y funciona sin necesidad de configuración.

### 3. Abrir en tu navegador

```bash
# Opción 1: Abrir archivo local
open index.html

# Opción 2: Con servidor local (Python)
python -m http.server 8000
# Luego: http://localhost:8000

# Opción 3: Con servidor local (Node.js)
npx http-server
# Luego: http://localhost:8080
```

## 📱 Uso

### Para Clientes:
1. **Registrarse** → "Iniciar Sesión" → "Crear Cuenta"
2. **Buscar** → Usa la barra de búsqueda con autocompletado
3. **Filtrar** → Por precio, marca, disponibilidad
4. **Comparar** → Selecciona hasta 3 productos
5. **Favoritos** → Haz clic en ❤️
6. **Comprar** → Carrito → Checkout con datos de envío
7. **Historial** → Ver compras pasadas y reordenar

### Para Administrador:
1. Abre la consola del navegador (F12)
2. Escribe: `openAdminModal()`
3. Ver estadísticas y ventas

## 🏗️ Estructura del Proyecto

```
KEWA/
├── index.html          # Archivo principal (todo en uno)
├── IMAGENES/           # Imágenes de productos
├── .gitignore          # Archivos a ignorar en git
├── README.md           # Este archivo
└── IDEAS_FUNCIONALIDADES.md  # Ideas futuras
```

## 🌐 Desplegar en GitHub Pages

### Paso 1: Crear repositorio en GitHub
1. Ir a [github.com/new](https://github.com/new)
2. Nombre: `KEWA`
3. Descripción: "Tienda de tecnología con sincronización en nube"
4. Public
5. Crear

### Paso 2: Subir código
```bash
git add .
git commit -m "🚀 Proyecto KEWA completo con 20 funcionalidades"
git branch -M main
git remote add origin https://github.com/tuusuario/KEWA.git
git push -u origin main
```

### Paso 3: Activar GitHub Pages
1. En tu repositorio → Settings → Pages
2. Branch: `main` → `/root`
3. Guardar
4. En 2-3 minutos estará en: `https://tuusuario.github.io/KEWA/`

## ⚙️ Configuración Avanzada

### Con Supabase (Datos en la nube)

Ya viene preconfigurado. Solo agrega tus credenciales en `.env`

### Sin Supabase (Solo localStorage)

Funciona perfectamente, datos guardados solo en el navegador.

## 🔐 Privacidad y Seguridad

- ✅ Los datos se guardan **encriptados** en Supabase
- ✅ API REST segura con autenticación
- ✅ Contraseñas hasheadas en la base de datos
- ✅ Cumple GDPR y protección de datos

## 📊 Base de Datos (Supabase)

Se crean automáticamente estas tablas:

```sql
-- Usuarios
users (id, name, email, password, phone, created_at)

-- Órdenes/Compras
orders (id, user_id, total, items, address, date)

-- Direcciones
addresses (id, user_id, description, address)

-- Opiniones
ratings (id, user_id, name, score, text, date)

-- Preguntas
questions (id, question, answer, likes)

-- Wishlist
wishlist (id, user_id, product_id, name, price)
```

## 🐛 Troubleshooting

### "Los datos no se sincronizan"
- Verifica que `.env` tenga credenciales correctas
- Abre DevTools (F12) → Console para ver errores

### "Supabase no funciona"
- Revisa que el proyecto esté activo en supabase.com
- Verifica que SUPABASE_URL y SUPABASE_KEY sean correctas

### "No puedo registrarme"
- Algunos navegadores viejos no funcionan, usa Chrome/Firefox reciente
- Intenta en modo anónimo

## 📈 Próximas Mejoras

- [ ] Integración con pasarelas de pago reales
- [ ] Emails automáticos
- [ ] Notificaciones en tiempo real
- [ ] App móvil
- [ ] Analytics avanzado
- [ ] SEO optimizado

## 👨‍💼 Créditos

Desarrollado por: **tu nombre**
Proyecto: KEWA - Soluciones Tecnológicas
Año: 2024

## 📞 Contacto

- 📧 Email: info@kewa.com
- 📱 WhatsApp: +502 5025-0728450
- 🌐 Facebook: [KEWA Facebook](https://www.facebook.com/profile.php?id=61589439091744)
- 📸 Instagram: [@kewa_gt](https://www.instagram.com/kewa_gt)
- 🎵 TikTok: [@kewa_gt](https://www.tiktok.com/@kewa_gt)

## 📄 Licencia

MIT License - Libre para usar, modificar y distribuir

---

**¿Preguntas?** Abre un [issue](https://github.com/tuusuario/KEWA/issues)

⭐ Si te gusta el proyecto, ¡dale una estrella en GitHub!
