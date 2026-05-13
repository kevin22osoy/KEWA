# 🚀 GUÍA RÁPIDA: SUBIR A GITHUB

## PASO 1️⃣: CREAR REPOSITORIO EN GITHUB

1. Abre: https://github.com/new
2. Rellena:
   - Repository name: **KEWA**
   - Description: **Tienda de tecnología con 20 funcionalidades**
   - Public (para que sea accesible)
3. Click: **Create repository**

---

## PASO 2️⃣: SUBIR TU CÓDIGO

Abre la terminal/PowerShell en tu carpeta KEWA y ejecuta:

```bash
git branch -M main
git remote add origin https://github.com/TU_USUARIO/KEWA.git
git push -u origin main
```

**Reemplaza `TU_USUARIO` con tu nombre de usuario de GitHub**

---

## PASO 3️⃣: ACTIVAR GITHUB PAGES

1. Ve a tu repositorio en GitHub
2. Settings → Pages
3. Branch: **main** → **/root**
4. Click: **Save**
5. En 2-3 minutos estará en: `https://TU_USUARIO.github.io/KEWA/`

---

## PASO 4️⃣: (OPCIONAL) CONFIGURAR SUPABASE

Si quieres sincronización en la nube:

1. Abre: https://supabase.com
2. Sign up (gratis)
3. New Project → Ingresa datos
4. Espera a que se cree (~5 min)
5. Settings → API → Copia:
   - `Project URL` (es tu SUPABASE_URL)
   - `anon key` (es tu SUPABASE_KEY)
6. Abre tu KEWA en: `https://TU_USUARIO.github.io/KEWA/`
7. Click en botón ⚙️ (abajo derecha)
8. Pega tus credenciales
9. ¡Listo! Datos sincronizados en la nube

---

## ✅ VERIFICACIÓN

- [ ] Proyecto visible en GitHub
- [ ] GitHub Pages activado
- [ ] Sitio funcionando en: `https://TU_USUARIO.github.io/KEWA/`
- [ ] (Opcional) Supabase configurado

---

## 🎯 COMANDOS ÚTILES DESPUÉS

```bash
# Ver estado
git status

# Hacer cambios y subir
git add .
git commit -m "Mi descripción del cambio"
git push

# Ver historial
git log
```

---

## 🆘 PROBLEMAS COMUNES

**"error: remote origin already exists"**
```bash
git remote remove origin
git remote add origin https://github.com/TU_USUARIO/KEWA.git
```

**"Permission denied"**
- Usa HTTPS en lugar de SSH
- O configura SSH: https://docs.github.com/en/authentication/connecting-to-github-with-ssh

**"GitHub Pages no aparece"**
- Espera 5 minutos
- Verifica que Settings → Pages esté en `main` branch
- Ve a: `https://TU_USUARIO.github.io/KEWA/` (NO sin /KEWA)

---

¡Listo! 🎉 Tu tienda está en línea
