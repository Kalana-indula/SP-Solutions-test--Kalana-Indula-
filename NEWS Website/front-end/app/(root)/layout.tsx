// app/news/layout.tsx
import React from "react";

const Layout = ({ children }: { children: React.ReactNode }) => {
    return (
        <div>
            {/* Section-level layout (e.g. sidebar, header, etc.) */}
            {children}
        </div>
    );
};

export default Layout;
